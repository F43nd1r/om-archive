
solution {
    puzzle = "P041"
    name = "NETDECK"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -4
        rotation = 13
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 1
        rotation = -2
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = 3 to 0
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 0 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -1 to 1
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 2 to 1
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = -1 to -1
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 3
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(12)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(6)
                reset()
            }
        }
        , 
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
            sequence(4) {
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
            sequence(5) {
                wait(5)
                grab()
                forward()
                drop()
                wait(2)
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                forward()
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
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
            sequence(2) {
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
        )
    }
}
