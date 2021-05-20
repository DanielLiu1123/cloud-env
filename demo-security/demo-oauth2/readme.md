# spring security oauth2 demo

***
***注意事项:***
> - 只演示了authorization_code(授权码模式), 其他模式都很简单, 建议观看[黑马spring security](https://www.bilibili.com/video/BV1EE411u7YV) (讲得很不错)
> - spring-cloud-starter-oauth2 已经过时, 使用spring-security-oauth2-autoconfigure代替
> - spring-authorization-server 已成为独立项目, 在spring实验项目里([spring-projects-experimental](https://github.com/spring-projects-experimental/spring-authorization-server))

***
***步骤:***
> 1. 获取code
>> GET  http://localhost:9000/oauth/authorize?&response_type=code&client_id=client01
> 2. 获取token
>> POST http://localhost:9000/oauth/token <br/>
> > 请求体:
>> ```json
>> {
>>   "grant_type":"authorization_code",
>>   "client_id":"client02",
>>   "client_secret":"llw1123",
>>   "code":"JJeXfD"
>> }
> 3. 获取到token
>> ```json
>> {
>>   "access_token": "2ed5d6d1-6947-45eb-8d83-7b19116d18f3",
>>   "token_type": "bearer",
>>   "refresh_token": "4827c1ab-bf8f-4d00-b7bb-919b11463285",
>>   "expires_in": 43022,
>>   "scope": "read write any"
>> }
> 4. 带上token请求资源
>> GET http://localhost:8000/private/read/hello?access_token=2ed5d6d1-6947-45eb-8d83-7b19116d18f3

***

