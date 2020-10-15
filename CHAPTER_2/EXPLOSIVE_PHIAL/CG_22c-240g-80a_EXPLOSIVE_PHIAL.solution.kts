
solution {
    puzzle = "P017"
    name = "B CG DOUBLE"
    arm(ARM1) {
        number = 1
        position = -5 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 0 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to 4
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = 2 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to 0
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, 1 to -1)
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
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
