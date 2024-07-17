document.addEventListener('DOMContentLoaded', function() {
    // 이미지 미리보기 업데이트
    const imageInput = document.getElementById('image');
    const imagePreview = document.getElementById('imagePreview');

    imageInput.addEventListener('change', function() {
        const file = this.files[0];
        if (file) {
            const reader = new FileReader();
            
            reader.onload = function(e) {
                imagePreview.src = e.target.result;
                imagePreview.style.display = 'block'; // 이미지 보이도록 설정
            };
            
            reader.readAsDataURL(file); // 이미지 파일을 데이터 URL로 읽기
        } else {
            imagePreview.src = '#';
            imagePreview.style.display = 'none'; // 이미지 숨기기
        }
    });

    // 폼 제출 이벤트 처리
    const performanceForm = document.getElementById('performanceForm');
    
    performanceForm.addEventListener('submit', function(event) {
        event.preventDefault(); // 폼 제출 기본 동작 방지

        const formData = new FormData(performanceForm);

        fetch('/savePerformance', {
            method: 'POST',
            body: formData
        })
        .then(response => response.json())
        .then(data => {
            if (data.success) {
                alert('공연 기획서가 저장되었습니다.');
                // 저장 후 필요한 동작 추가
            } else {
                alert('저장에 실패했습니다.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('저장 중 오류가 발생했습니다.');
        });
    });
});