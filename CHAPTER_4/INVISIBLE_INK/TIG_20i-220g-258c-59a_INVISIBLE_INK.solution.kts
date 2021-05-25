
solution {
    puzzle = "P032"
    name = "TI"
    arm(ARM2) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 0 to 3
        rotation = 4
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to 3
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = -1
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to -1
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 2
        rotation = 3
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(27)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(30)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(44)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(35)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
