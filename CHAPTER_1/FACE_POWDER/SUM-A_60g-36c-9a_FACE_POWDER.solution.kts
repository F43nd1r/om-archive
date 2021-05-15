
solution {
    puzzle = "P009"
    name = "B S F"
    arm(ARM1) {
        number = 1
        position = 0 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
