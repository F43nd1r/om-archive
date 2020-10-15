
solution {
    puzzle = "P080"
    name = "B X S 2T"
    arm(ARM1) {
        number = 1
        position = -2 to 4
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 4
    }
    track {
        position = -2 to 5
        positions = listOf(0 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(2)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
                grab()
                pivotCounterClockwise()
                reset()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                wait(1)
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(1)
                reset()
            }
        }
        )
    }
}
