
solution {
    puzzle = "P100"
    name = "B CX 3T"
    arm(ARM1) {
        number = 1
        position = 7 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 0
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to 2
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 5 to -4
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(-1 to 0, 0 to -1, 1 to -2, 1 to -1, 0 to 0, -1 to 1)
    }
    track {
        position = 6 to -3
        positions = listOf(1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                forward()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                wait(7)
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                forward()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(16)
                forward()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                forward()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
