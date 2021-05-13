
solution {
    puzzle = "P026"
    name = "B CI26G"
    arm(ARM6) {
        number = 1
        position = 2 to 2
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -1 to 3
        rotation = 6
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 1 to 3
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -3 to 6
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 7
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to 4
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 7
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -4 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 6
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = -2 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
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
            sequence(6) {
                wait(6)
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
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
