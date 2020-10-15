
solution {
    puzzle = "P097"
    name = "B X S 6T"
    arm(ARM2) {
        number = 1
        position = 2 to -2
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = 0 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 3
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -7
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -28 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 0
        rotation = 0
    }
    track {
        position = -3 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to -1)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(13)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(25)
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                wait(10)
                grab()
                back()
                reset()
                wait(7)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                wait(9)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(29)
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                back()
                reset()
                wait(13)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                repeat()
                wait(26)
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                forward()
                grab()
                back()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(7)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
