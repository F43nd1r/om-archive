
solution {
    puzzle = "P029"
    name = "INSTRUCTIONS NO TRACK 18"
    arm(ARM6) {
        number = 1
        position = 1 to -4
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 3 to -3
        rotation = 10
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 1 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to 3
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -14 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -4
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
                wait(3)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
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
