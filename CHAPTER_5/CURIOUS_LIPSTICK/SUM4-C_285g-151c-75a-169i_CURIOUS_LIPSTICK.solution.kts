
solution {
    puzzle = "P041"
    name = "B X S F"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 3
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to 1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 0 to 2
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 8
        position = 2 to -2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 1 to 0
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = 1 to -3
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -1 to 2
        rotation = 3
    }
    glyph(DISPOSAL) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                rotateClockwise()
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                wait(2)
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                wait(2)
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
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
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
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
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                forward()
                wait(2)
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                repeat()
                wait(7)
                repeat()
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
