
solution {
    puzzle = "P021"
    name = "B CGX 1"
    arm(ARM1) {
        number = 1
        position = -3 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = 0 to -3
        rotation = 1
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
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
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
