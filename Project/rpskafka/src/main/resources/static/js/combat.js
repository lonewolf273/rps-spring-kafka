function fight(player)
{
	changeTitle(player);
	com = getComChoice();
	displayImage(com);
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

function reset()
{
	location.reload();
}