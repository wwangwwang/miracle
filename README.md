# 그룹웨어 프로젝트 Miracle


---

그룹웨어 기본 연동 기능 및 메시지 봇 구현프로젝트입니다. 
Spring Boot를 활용하여 "공연 기획 회사 그룹웨어" 웹사이트를 구현하였습니다.


## 프로젝트 소개

---

현대 비즈니스 환경에서는 업무 효율성과 소통의 중요성이 점점 더 강조되고 있습니다. 
이러한 필요성을 충족시키기 위해 우리는 Spring Boot를 활용하여 "공연 기획 회사"를 위한 최첨단 그룹웨어 시스템을 개발하였습니다.
이 시스템은 메일 연동, 일정 관리, 전자결재, 게시판, 그리고 챗봇 기능을 통합하여 직원들의 업무 효율성과 편의를 극대화합니다.


## 개발 기간

---

- 2024.07.03(수) ~ 2024.07.29(월)
- 그룹웨어 이해
- 아이디어 노트 작성 및 최종 결정
- 구현할 기능 정리
- 설계 발표
- 기능 설계
- 발표 평가


## 개발자 소개

---

- 김도영 : 팀장 / 로그인(Spring security), 홈화면, 메일연동
- 박태주 : 부팀장 / 인사관리(조직도, 프포필조회) - 조직연동 >> 관리자 페이지, 잔소리, 고나리
- 유해리 : 챗봇
- 전용준 : 일정관리, 공연일정관리, 전자결재(공연 기획안)
- 윤민석 : 마이페이지(프로필 수정), 게시판(공지사항/자유게시판)


## 개발환경

---

|프론트엔드|백엔드|협업툴|
|:---:|:---:|:---:|
|HTML|java 17|git 2.45.2|
|CSS|Spring Boot 3.2.7|github|
|JavaScript|Spring Data JPA 3.3.1|notion|
|Thymeleaf 3.1|Spring security 6|padlet|                                                                                     
|jQuery 3.7.1|MariaDB|figma|


## 주요 기능

---

- ### 공지사항 및 게시판
    - **관리자** 권한이 있는 계정으로 로그인 했을 때만 공지사항에 글을 등록, 수정, 삭제가 가능하다.
    - 자유게시판 글 등록, 수정, 삭제는 모든 사람이 이용할 수 있도록 일반 사원 권한자도 이용 가능하다.

- ### 인사관리
    - **관리자** 권한이 있는 계정으로 로그인 했을 때만 보이는 버튼으로 사원을 등록 수정 삭제가 가능하다.
    - **관리자** 권한이 없으면 버튼이 보이지 않고 회사의 조직도를 볼 수 있고 사원명을 클릭하면 그 직원의 
    상세 정보를 확인 할 수 있다.

- ### 로그인
    - spring security를 사용하여 로그인을 하지 않은 사용자에게는 로그인 페이지를 제외한 모든 페이지 접근이 불가하다.
    - 아이디, 비밀번호 일치하지 않을 시 로그인 실패 메세지가 뜬다.
		
- ### 홈화면
    - 현재 로그인된 사람의 정보를 가져와서 이름, 부서가 뜬다.
    - 공연 기획안, 개인일정, 공지사항, 자유게시판의 내용이 수정될때마다 업데이트된다.
    - 10분간 아무 활동이 없을 시 자동 로그아웃 된다. (상단에 자동 로그아웃까지 남은 시간이 뜬다.)

- ### 메일연동
    - 현재 로그인된 사람의 메일 리스트가 뜬다.
    - 리스트에 메일 제목을 누르면 상세 메일 내용이 뜬다.
		
- ### 챗봇
    - 우측 하단 토글버튼을 누르면 챗봇창이 뜨면서 웹소켓이 연결/해제된다.
    - 각 질문 버튼을 누르면 트리형 구조에 의해 하위 버튼이나 답변메세지가 뜬다.
    - 사용자가 입력한 키워드가 서버로 전송되면 DB에 저장된 답변을 메세지로 받아서 출력한다.
		
- ### 개인일정
    - 현재 로그인된 사람의 개인 일정이 표기되는 캘린더가 뜬다.
    - 입력되어있는 일정의 내용이 뜬다.

- ### 공연기획
    - 작성 된 이력이 있는 기획서들은 모두 목록에 뜬다.
    - 기획서 작성이 가능하며 작성된 이력서들은 모두 결재대기로 전송된다.
		
- ### 전자결재
    - **관리자** 권한이 있는 계정으로 로그인했을때만 전자결재페이지 접속가능하다
    - 결재대기 목록의 기획서들만 상세페이지에서 승인, 보류가 가능하고 승인, 보류 입력후 각 목록으로 이동된다.
