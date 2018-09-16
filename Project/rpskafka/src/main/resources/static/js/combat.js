function fight(player)
{
	changeTitle(player);
	com = getComChoice();
	displayImage(com);
	changeResult(getResult(player, com));
	
	//creates a record class for use in the Java Application
	s = {playerChoice:player, comChoice:com, result:getResult(player, com)};
	
	//sends a post request of type JSON to the page
	$.ajax({
		  type: "POST",
		  contentType: "application/json; charset=utf-8",
		  url: "/",
		  data: JSON.stringify(s),
		  dataType: "json"
	});
	
}

function changeResult(result)
{
	s = "";
	switch(result)
	{
	case -1:
		s = "You have lost!";
		break;
	case 1:
		s = "You have won!";
		break;
	default:
		s = "It was a draw!";
	}
	document.getElementById("result").innerHTML = s;
}

function changeTitle(type)
{
	document.getElementById("title").innerHTML = "You chose " + type + "!";
}

function displayImage(type)
{
	document.getElementById("view").src="/img/" + type + ".png";
}

function getComChoice()
{
	i = Math.random();
	if(i < 1.0/3.0) return "rock";
	if(i < 2.0/3.0) return "paper";
	return "scissors";
}


function checkDraw(player, com)
{
	return player==com;
}

function checkWin(player, com)
{
	if(player == "rock" && com == "paper") return false;
	if(player == "paper" && com == "scissors") return false;
	if(player == "scissors" && com == "rock") return false;
	return true;
}

function getResult(player, com)
{
	if(checkDraw(player, com)) return 0;
	if(checkWin(player, com)) return 1;
	return -1;
}

function reset()
{
	location.reload();
}