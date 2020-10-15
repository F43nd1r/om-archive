
solution {
    puzzle = "P024"
    name = "H3 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -3 to 0
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to -2
        rotation = 2
        size = 1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 4 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 4 to -2
        rotation = 0
    }
    track {
        position = -3 to -2
        positions = listOf(1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
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
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
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
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
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
            sequence(1) {
                wait(7)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
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
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
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
            sequence(3) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
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
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
            }
        }
        )
    }
}
