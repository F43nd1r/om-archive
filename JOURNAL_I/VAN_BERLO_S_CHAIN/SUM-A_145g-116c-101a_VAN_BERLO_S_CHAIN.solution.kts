
solution {
    puzzle = "P055"
    name = "SUM  6T BETTER"
    arm(ARM1) {
        number = 1
        position = 3 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = -1
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 4 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 4 to -1
        positions = listOf(2 to 0, 1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
