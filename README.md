# PellyRestApiJava
Pelly Rest API ( Java version )

[ project 세팅 방법 ]

1. Git Clone
  1) working tree 에서 Pelly 폴더만 import project 한다.

2. Gradle 환경 설정
  1) Pelly project root 폴더를 우클릭 -> Configure -> Add gradle nature -> 완료될 때까지 대기
  2) Pelly project root 폴더를 우클릭 -> Gradle -> Refresh gradle -> 완료될 때까지 대기
  3) Project Explorer 에서 에러표시 모두 사라지면 성공
  
3. 서버 실행
  1) Pelly project root 폴더를 우클릭 -> Run As -> Spring Boot App
     * REST API 이므로 index.html 이 존재하지 않음.
     
4. API Docs 확인
  1) 브라우저 실행 -> localhost:8090/swagger-ui.html
