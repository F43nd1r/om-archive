
solution {
    puzzle = "P021"
    name = "B CI20"
    arm(ARM6) {
        number = 1
        position = 1 to 2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to 2
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 2 to 1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -3 to 3
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to 4
        rotation = 0
    }
    track {
        position = 3 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
