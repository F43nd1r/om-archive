
solution {
    puzzle = "P085"
    name = "B S 6T"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(-1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(10)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                back()
                reset()
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                back()
                reset()
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                back()
                reset()
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                back()
                reset()
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                back()
                reset()
                wait(6)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
