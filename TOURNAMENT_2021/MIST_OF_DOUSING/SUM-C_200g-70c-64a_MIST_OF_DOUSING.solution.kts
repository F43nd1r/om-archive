
solution {
    puzzle = "w2450512021"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -3 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to -2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -5
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -6
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -3 to -3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -4 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 2
    }
    track {
        position = -2 to -6
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
