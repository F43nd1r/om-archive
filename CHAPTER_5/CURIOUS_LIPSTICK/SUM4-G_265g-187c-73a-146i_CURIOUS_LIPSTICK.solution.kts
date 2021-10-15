
solution {
    puzzle = "P041"
    name = "NEW SOLUTION 3 (Copy) (Copy)"
    arm(ARM1) {
        number = 1
        position = -7 to 0
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -1
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -3 to -2
        rotation = 8
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 6
        position = -4 to -5
        rotation = 7
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -1 to -5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -2 to -3
        rotation = 11
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 8
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -3 to -5
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = -5 to -1
        rotation = 2
    }
    glyph(DISPOSAL) {
        position = -4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 1
        rotation = 0
    }
    track {
        position = -4 to 0
        positions = listOf(1 to -2, 1 to -1, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(12)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(10)
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
            sequence(7) {
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
            sequence(5) {
                wait(5)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                wait(1)
                back()
                wait(3)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                back()
                wait(1)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                wait(3)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(9)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
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
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
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
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
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
            }
        }
        )
    }
}
