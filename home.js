var mine = document.getElementById("colores")

mine.onclick = function() {
    var colors = ["red", "blue", "green", "black", "purple", "cyan"];
    document.body.style.backgroundColor = colors[Math.floor(Math.random() * 6)];
}

var i = 0;
var txt = 'Loading...'; 
var speed = 100; 
var count=0;
var t = 10;

var cou = document.getElementById("countdown")
cou.onclick = function typeWriter() {
    
    if(count < 3){
        if(i >= txt.length){
            i = 0;
            document.getElementById("message").innerHTML = "";
            count += 1;
        
        }

        if (i < txt.length) {
            document.getElementById("message").innerHTML += txt.charAt(i);
            i++;
            
    
        }

        
        setTimeout(typeWriter, speed);

    }
    if(count == 3) {
        function timer(){
            
            if(t >= 0){
                document.getElementById("message").innerHTML = t-.5;
              t = t - .5;
             
            }
            if(t == 0) {
                clearInterval(timer);
                document.getElementById("message").innerHTML = "Bye bye"
                setTimeout(window.location.assign("http://www.google.com"), 2000)
            }
      }
      setInterval(timer, 1000);
    }
    
    
    
  }

