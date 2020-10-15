
solution {
    puzzle = "P022"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 3
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 0 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
