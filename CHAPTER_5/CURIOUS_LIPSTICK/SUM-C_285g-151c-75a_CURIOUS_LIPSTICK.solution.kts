
solution {
    puzzle = "P041"
    name = "NEW SOLUTION 3 (Copy)"
    arm(ARM1) {
        number = 1
        position = 5 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 6 to -3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 7 to -6
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 9 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 10 to -5
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 10 to -6
        rotation = 8
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = 9 to -9
        rotation = 7
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 12 to -9
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 11 to -7
        rotation = 11
        size = 1
    }
    glyph(BONDER) {
        position = 9 to -4
        rotation = 8
    }
    glyph(BONDER) {
        position = 10 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = 12 to -8
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 10 to -9
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = 8 to -5
        rotation = 2
    }
    glyph(DISPOSAL) {
        position = 9 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 12 to -10
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 13 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -5
        rotation = 0
    }
    track {
        position = 9 to -4
        positions = listOf(1 to -2, 1 to -1, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(9) {
                wait(12)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateClockwise()
                drop()
                wait(3)
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
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                wait(1)
                back()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                back()
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                wait(2)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
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
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
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
                rotateClockwise()
                drop()
                rotateCounterClockwise()
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
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
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
