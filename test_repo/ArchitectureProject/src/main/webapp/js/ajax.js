function getPk(){
    const pkId = document.getElementById('pkid').value;
    /* 
        What is ajax?
            Asynchronous Javascript and xml
        There are four steps to implementing ajax
    */
   /* 
        step 1
            the following object allows us to make requests over
                http and get data back. This is our data retriever.s
   */
   const xhr = new XMLHttpRequest();

   //step 2, add an event listener
   xhr.onreadystatechange = function (){
        console.log("The state has changed");
        if(xhr.readyState===4 && xhr.status === 200){
            console.log("we are ready");
            /* what is the ready state?
                    the state of the request
                ready state:
                0 = request has not been initialized
                1 = server connection has been established
                2 = requests recieved
                3 = processing request
                4 = request has finished and the response is ready
                
            status code
                http status code, the condition of the response
              
            status codes:
                100 = informational
                200 = ok 
                300 = redirect
                400 = client side error
                500 = server side error
                */
               const pk = JSON.parse(xhr.responseText);
               // console.log(pk);

               implant();
        }
   }

   /* 
    step 3
        create connection
        open(httpMethod, url)
        open(httpMethod, url, aysync (true buy deafult))
   */
  xhr.open('GET', 'http://pokeapi.co/api/v2/pokemon/'+pkId);

   /* step 4
   sends the request to retrieve information */

   xhr.send();
}

document.getElementById('pksubmit').addEventListener('click', getpkBetter);

function implant(json) {
    document.getElementById("pkinfo").innerHTML = json.name;
  }

  function getpk2(){
    const pkId = document.getElementById('pkid').value;
      const xhr = new XMLHttpRequest();
      xhr.onreadystatechange=function(){
          if(xhr.readyState===4&&xhr.status===200){
              implant(Json.parse(xhr.responseText));
          }
      }
      xhr.open('GET', 'http://pokeapi.co/api/v2/pokemon/'+pkId);
      xhr.send();
  }

  //fetch api
  function getpkBetter(){
    const pkId = document.getElementById('pkid').value;
    fetch ('http://localhost:8080/ArchitectureProject/building.json?id='+pkId)
        .then(response => response.json()) 
        .then(json=> implant(json));
  }

  function putBuilding(){
	    fetch('http://localhost:8080/ArchitectProject/create.json',{
	        method: 'put',
	        body: `
	    {"id":1,"name":"hey arnold","owner":3}
	    `,
	    }).then(r=>console.log(r));

}