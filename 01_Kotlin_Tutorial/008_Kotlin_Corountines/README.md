# 코틀린 코루틴 소개 (Android) | 오준석의 생존코딩
https://youtu.be/n0o_797mf-M?si=UkCnF_wl9Gn37iGE

<hr>

# Kotlin Coroutines 톺아보기 | 당근마켓 Server 밋업 1회 | 당근테크

https://youtu.be/eJF60hcz3EU?si=odnr6-LJCagEYLvF

- https://github.com/gaaon/kotlin-coroutines-examples

- ppt https://www.slideshare.net/xodn4195/kotlin-coroutines-250871163

# Q & A
- 코드에서 withcontext에서 dispatcher.io 으로 새로운 코루틴이 생성되 각각 다른 scope에서 진행되는줄 알았는데, 설명 읽어보니 dispatcher.main이 해당부분에서 변환되어 진행되고 다시 첫번째 줄로  돌아가는 원리인것같은데 이러면 dispatcher.io로 바뀔이유가 있나요?
- Coroutine의 IO Dispatcher와 Default Dispatcher 의 사용 시 차이 https://sandn.tistory.com/110 
  - 제가 공부한걸 이해한게 맞으면 새로운 스코프를 만드는게 아니라 이미 있는 IO 코루친으로 context를 전환했다가 돌아오는걸로 압니다
  - *코루틴
  - 중간에 블로킹작업이 있으면 그렇게 변환해서 사용하라는 취지인거죠
  - 코루틴스쿠프함수는 부모 코루틴스쿠프를 그대로 상속하고 job만 오버라이딩 합니다. 그중 withcontext는 인자로 받은 코루틴컨텍스트를 오버라이딩하죠
  - 인자로 디스패쳐만 받앗다면 코루틴컨텍스트중 디스패쳐만 오버라이딩하게 된다는 의미입니다
