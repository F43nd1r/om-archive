
solution {
    puzzle = "P106"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = -1
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -2 to 2, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(19)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
