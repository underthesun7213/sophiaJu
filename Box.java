class Box{

	int width; 	//가로
	int length;	//세로
	int height;	//높이
//이 외에도 속이 비었는지 bool isEmpty와 재질과 색상은 어떤지 string color, string material 등이 있을 수 있다.

	void setWidth(int num){				//상자의 가로의 길이를 설정한다.
		this.width = num;
	}

	int getWidth(){						//가로의 길이에 접근해 반환한다.
		return this.width;
	}

	void setLength(int num){				//세로의 길이를 설정한다.
		this.length = num;
	}

	int getLength(){					//세로의 길이에 접근해 반환한다.
		return this.length;
	}

	void setHeight(int num){			//높이의 길이를 설정한다.
		this.height = num;
	}

	int getHeight(){					//높이의 길이에 접근해 반환한다.
		return this.height;
	}

	int getVolume(){					//가로*세로*높이로 부피를 구해 반환한다.
		return width*length*height;
	}

	public String toString(){			//int형 변수인 field 값들을 String 형으로 바꾼다.
		return String.format("상자의 가로: "+ width +", 세로: " + length + ", 높이: "+ height);
	}
}