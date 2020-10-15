
solution {
    puzzle = "P018"
    name = "B CG 1"
    arm(ARM3) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to -1
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 1 to -2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
