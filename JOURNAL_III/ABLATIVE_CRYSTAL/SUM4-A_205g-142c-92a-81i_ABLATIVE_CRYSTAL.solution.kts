
solution {
    puzzle = "P068"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 3 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 5 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 11 to -4
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 8 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 7 to -3
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 11 to -1
        rotation = 0
    }
    track {
        position = 4 to -4
        positions = listOf(0 to 1, -1 to 1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(26)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
