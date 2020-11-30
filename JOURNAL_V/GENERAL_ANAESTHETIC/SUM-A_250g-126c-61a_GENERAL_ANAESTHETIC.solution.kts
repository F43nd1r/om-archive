
solution {
    puzzle = "P086"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to -3
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = -3 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 5 to -1
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = -4 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -3 to -2
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(7)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(5)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(17)
                grab()
                rotateCounterClockwise()
                wait(4)
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(11)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
            }
        }
        )
    }
}
