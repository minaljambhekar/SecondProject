(function () {
    'use strict';

    angular
        .module('app')
        .factory('FriendService', FriendService);

    FriendService.$inject = ['$http','$q'];
    function FriendService($http,$q) {
        var service = {};
        var Base_URL='http://localhost:8080/chitchatRest';
        
        service.getMyFriends=getMyFriends;               
        service.getMyFriendRequests=getMyFriendRequests; 
        service.sendFriendRequest=sendFriendRequest;     
         
        service.acceptFriendRequest=acceptFriendRequest; 
        service.rejectFriendRequest=rejectFriendRequest; 
        //service.deleteFriend=deleteFriend;
        
        return service;
        
        function sendFriendRequest(friendId){
            return $http.get(Base_URL+'/addFriend/'+friendId)
                    .then(
                                 function(response){
                                            return response.data;
                                 }, function(errResponse) {
                                     console.error('FriendService: Error while creating friend');
                                     return $q.reject(errResponse);
                                 }
                             );
        }
        
        function getMyFriends() {
            return $http.get(Base_URL+'/myFriends/')
                    .then(
                                 function(response){
                                            return response.data;
                                 }, null
                         );
        }
        
        function getMyFriendRequests(){
            return $http.get(Base_URL+'/getMyFriendRequests/')
                    .then(
                                 function(response){
                                            return response.data;
                                 }, null
                         );
        }
        
        function acceptFriendRequest(friendId){
        	console.log("=>FService: acceptFriendRequest:"+friendId)
            return $http.get(Base_URL+'/acceptFriend/'+friendId)
                    .then(
                                 function(response){
                                            return response.data;
                                 }, function(errResponse) {
                                     console.error('FriendService: Error while adding friend');
                                     return $q.reject(errResponse);
                                 }
                             );
        }
        
        function rejectFriendRequest(friendId){
            return $http.get(Base_URL+'/rejectFriend/'+friendId)
                    .then(
                                 function(response){
                                            return response.data;
                                 }, function(errResponse) {
                                     console.error('FriendService: Error while rejecting friend');
                                     return $q.reject(errResponse);
                                 }
                             );
        }
        
    }   
})();