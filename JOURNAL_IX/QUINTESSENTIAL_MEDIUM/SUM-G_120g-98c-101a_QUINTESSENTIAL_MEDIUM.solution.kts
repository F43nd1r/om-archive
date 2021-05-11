
solution {
    puzzle = "P107"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -1
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 0
        rotation = -8
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -7
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = -7
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = -7
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
