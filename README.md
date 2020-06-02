# OAuth2DemoApp

http://localhost:8080/oauth/authorize?client_id=hiest&response_type=code&scope=user_info


curl -X POST --user hiest:abcd http://localhost:8080/oauth/token \
        -H "content-type: application/x-www-form-urlencoded" \
        -d "code=KE11wi&grant_type=authorization_code&redirect_uri=http%3A%2F%2Flocalhost%3A8081%2Flogin&scope=user_info"\

1))))))
curl -X GET \
  http://localhost:8080/api/customer/1 \
  -H 'Authorization: Bearer 78f4a69f-bff8-4d46-b88f-2bc453de3b34\
  -H 'cache-control: no-cache'

curl -X GET \
  http://localhost:8080/api/users/me  \
  -H 'Authorization: Bearer e574c9d1-f26c-4574-ba8e-868a25cfeba1 \
  -H 'cache-control: no-cache'


2)))))
curl -X GET http://localhost:8080/api/customer/1  -H "authorization: Bearer 78f4a69f-bff8-4d46-b88f-2bc453de3b34"


curl -X GET http://localhost:8080/api/users/me  -H "authorization: Bearer e574c9d1-f26c-4574-ba8e-868a25cfeba1"
