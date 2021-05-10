
solution {
    puzzle = "P029"
    name = "INSTRUCTIONS NO TRACK 17"
    arm(ARM6) {
        number = 1
        position = -3 to -1
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 0 to -3
        rotation = 9
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 2 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to -1
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = 1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
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
        )
    }
}
