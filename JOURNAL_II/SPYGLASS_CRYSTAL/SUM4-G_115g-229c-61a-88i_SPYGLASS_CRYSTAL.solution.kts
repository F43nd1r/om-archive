
solution {
    puzzle = "P063"
    name = "ELEGANT 398 (SUM4?)"
    arm(ARM6) {
        number = 1
        position = -3 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(2 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                back()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                back()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
