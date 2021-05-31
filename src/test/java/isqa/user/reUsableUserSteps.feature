@ignore
Feature: Re-usable steps user

  Background:
    * url urlBase
    * def testData = Java.type('dataGenerator')
    Given header User-Agent = 'lalala'

  @GetListUser
  Scenario: Re-usable get list user
    * def getQuery = read('getListUserQuery.graphql')
    * def getVariable = {}
    When request {query: '#(getQuery)', variables: '#(getVariable)'}
    And print getQuery
    And print getVariable
    And method post
    And print response
    Then status 200
    * def id = response.data.users.data[0].id
    * def name = response.data.users.data[0].name