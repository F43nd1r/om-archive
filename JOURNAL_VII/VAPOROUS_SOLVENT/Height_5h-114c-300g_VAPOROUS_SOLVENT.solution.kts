
solution {
    puzzle = "P098"
    name = "H5"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to 3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 3 to 0
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 3 to 3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to -1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 2 to 3
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = 5 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = -6
    }
    glyph(PURIFICATION) {
        position = 4 to 0
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 4 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 4 to 0
        positions = listOf(1 to 3, 0 to 3, -1 to 3)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                back()
                forward()
                back()
                back()
                drop()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
