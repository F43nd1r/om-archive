
solution {
    puzzle = "P018"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 5 to -2
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -4
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 2
        position = 0 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
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
        )
    }
}
