Feature: User

  Background:
    * url urlBase
    * def testData = Java.type('dataGenerator')
    Given header User-Agent = 'lalala'

  @Development @parralel=false
  Scenario: Create user
    * def createQuery = read('createUserQuery.graphql')
    * def expectedSchemaResponse = read('createUserResponseSchema.json')
    * def createVariable = {name: 'Patricia Lebsack', username: 'Karianne', email: 'Julianne.OConner@kory.org', street: 'Hoeger Mall', city: 'South Elvis', zipcode: '53919-4257', phone: '493-170-9623 x156', website: 'kale.biz', companyName: 'Robel-Corkery'}
    When request {query: '#(createQuery)', variables: '#(createVariable)'}
    And print createQuery
    And print createVariable
    And method post
    And print response
    Then status 200
    And match response == expectedSchemaResponse
    And match response.data.createUser.name == 'Patricia Lebsack'

  @Development @parralel=true
  Scenario: Get list user
    * def getQuery = read('getListUserQuery.graphql')
    * def getVariable = {limit : 3}
    When request {query: '#(getQuery)', variables: '#(getVariable)'}
    And print getQuery
    And print getVariable
    And method post
    And print response
    Then status 200
    And match each response.data.users.data[*].id != '#null'
    And assert response.data.users.data.length == 3

  @Development @parralel=false
  Scenario: Get detail user
    * def getListUser = call read('reUsableUserSteps.feature@GetListUser')
    * def getQuery = read('getDetailUserQuery.graphql')
    * def getVariable = {id: '#(getListUser.id)'}
    When request {query: '#(getQuery)', variables: '#(getVariable)'}
    And print getQuery
    And print getVariable
    And method post
    And print response
    Then status 200
    And match response.data.user.name == '#(getListUser.name)'