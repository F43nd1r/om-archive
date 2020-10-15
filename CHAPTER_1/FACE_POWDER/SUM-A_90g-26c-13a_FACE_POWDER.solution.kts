
solution {
    puzzle = "P009"
    name = "B CGX"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 6
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -1 to 1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 2
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
