
solution {
    puzzle = "P097"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -5 to 3
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to -5
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -3 to -7
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -2 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -6 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to -6
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to -3
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -3 to 1, -3 to 0, -4 to 0, -5 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                reset()
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                wait(1)
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                grab()
                rotateClockwise()
                reset()
                wait(11)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        )
    }
}
