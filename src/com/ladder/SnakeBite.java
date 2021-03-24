package com.ladder;

public class SnakeBite {
	public static void main(String[] args) {
		// final int start = 0;
		System.out.println("Single Player Start possition 0");
		System.out.println("Welcome to the Snake Ladder game");
		// to get random value
		int dievalue = (int) ((Math.random() * 100) % 6) + 1;
		System.out.println(dievalue);

		// variables
		final int start = 0;
		final int noPlay = 0;
		final int ladder = 1;
		final int snake = 2;
		int firstPlayerPosition = 0;
		int secondPlayerPosition = 0;
		int diceRollCount = 0;
		int diceRollCount2nd = 0;

		// iterating while loop till either 1st player or 2nd player reaches winning
		// position

		while (firstPlayerPosition <= 100 && secondPlayerPosition <= 100) {
			// to get random dice value
			// int dieValue = (int) ((Math.random() * 100) % 6) + 1;
			diceRollCount++;

			// to get status of player if its no play,ladder or snake

			int player1Status = (int) (Math.random() * 100) % 3;

			// checking 1st player status if its no play,ladder or snake

			switch (player1Status) {
			case noPlay:
				firstPlayerPosition += 0;
				break;
			case ladder:
				// if 1st player gets LADDER status will get one more chance to roll a dice
				firstPlayerPosition += dievalue;
				if (firstPlayerPosition > 100) {
					firstPlayerPosition -= dievalue;
				}
				// iterating while loop till 1st player status is no play or snake
				while (player1Status == 1) {
					player1Status = (int) (Math.random() * 100) % 3;
					if (player1Status == 1) {
						dievalue = (int) ((Math.random() * 100) % 6) + 1;
						firstPlayerPosition += dievalue;
						diceRollCount++;
						if (firstPlayerPosition > 100) {
							firstPlayerPosition -= dievalue;
						}
						if (firstPlayerPosition == 100) {
							break;
						}
					}
					if (player1Status == 2) {
						dievalue = (int) ((Math.random() * 100) % 6) + 1;
						firstPlayerPosition -= dievalue;
						diceRollCount++;
						break;
					}
				}

				break;
			default:
				firstPlayerPosition -= dievalue;
				break;
			}

			System.out.println("1st player position is " + firstPlayerPosition);

			// checking if 1st player position less than 0

			if (firstPlayerPosition < 0) {
				firstPlayerPosition = 0;
				System.out.println("1st player position is " + firstPlayerPosition);
			}

			// checking if 1st player position exceeds the limit 100

			if (firstPlayerPosition > 100) {
				firstPlayerPosition -= dievalue;
				System.out.println("player goes to its previous position " + firstPlayerPosition);
			}

			// checking if 1st player position reaches exact limit of 100

			if (firstPlayerPosition == 100) {
				System.out.println("1st player reaches winning position " + firstPlayerPosition);
				System.out.println("total number of times dice rolled by 1st player " + diceRollCount);
				break;
			}

			// for 2nd player

			// to get 2nd dice value

			int die2Value = (int) ((Math.random() * 100) % 6) + 1;
			diceRollCount2nd++;

			// to get status of 2nd player if its no play,LADDER or snake

			int player2Status = (int) (Math.random() * 100) % 3;

			// checking for 2nd player status

			switch (player2Status) {
			case noPlay:
				secondPlayerPosition += 0;
				break;
			case ladder:
				// if 2nd player gets ladder status will again get chance to roll a dice

				secondPlayerPosition += die2Value;
				if (secondPlayerPosition > 100) {
					secondPlayerPosition -= die2Value;
				}
				// iterating while loop till 2nd player gets no play or snake status

				while (player2Status == 1) {
					player2Status = (int) (Math.random() * 100) % 3;
					if (player2Status == 1) {
						die2Value = (int) ((Math.random() * 100) % 6) + 1;
						secondPlayerPosition += die2Value;
						diceRollCount2nd++;
						if (secondPlayerPosition > 100) {
							secondPlayerPosition -= die2Value;
						}
						if (secondPlayerPosition == 100) {
							break;
						}
					}
					if (player2Status == 2) {
						die2Value = (int) ((Math.random() * 100) % 6) + 1;
						secondPlayerPosition -= die2Value;
						diceRollCount2nd++;
						break;
					}
				}
				break;

			default:
				secondPlayerPosition -= die2Value;
				break;
			}

			System.out.println("2nd player position is " + secondPlayerPosition);

			// checking if 2nd player position less than 0

			if (secondPlayerPosition < 0) {
				secondPlayerPosition = 0;
				System.out.println("2nd player position is " + secondPlayerPosition);
			}

			// checking if 2nd player position increases limit

			if (secondPlayerPosition > 100) {
				secondPlayerPosition -= die2Value;
				System.out.println("2nd player goes to its previous position " + secondPlayerPosition);
			}

			// checking if 2nd player reaches exact 100th position

			if (secondPlayerPosition == 100) {
				System.out.println("2nd player reaches winning position " + secondPlayerPosition);
				System.out.println("total number of times dice rolled by 2nd player " + diceRollCount2nd);
				break;
			}

		}

	}
}
