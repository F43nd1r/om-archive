
solution {
    puzzle = "P100"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -10 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -10 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -10 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -9 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -7 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 2
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    track {
        position = -10 to 0
        positions = listOf(1 to 1, 2 to 1, 2 to 2, 1 to 2, 0 to 2)
    }
    track {
        position = -9 to 0
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = -2 to 0
        positions = listOf(3 to 1, 2 to 1, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(7)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                extend()
                drop()
                back()
                reset()
                wait(2)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(20)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                back()
                grab()
                forward()
                reset()
                back()
                grab()
                back()
                reset()
                wait(8)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(18)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                reset()
                wait(1)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(21)
                grab()
                back()
                reset()
            }
        }
        )
    }
}
