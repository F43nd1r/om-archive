
solution {
    puzzle = "w2450512021"
    name = "W4"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to 6
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -2
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to 5
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 5 to 3
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 2 to 4
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 3 to 1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to 6
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 0 to 0
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 4 to 4
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 1, -3 to 2, -3 to 3)
    }
    track {
        position = 3 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 2 to 4
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(8)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                extend()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                forward()
                extend()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(8)
                forward()
                wait(7)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                forward()
                forward()
                wait(1)
                back()
                back()
                forward()
                reset()
                wait(3)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                forward()
                forward()
                wait(1)
                back()
                back()
                forward()
                drop()
                wait(4)
                grab()
                forward()
                back()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                extend()
                forward()
                pivotClockwise()
                forward()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                extend()
                forward()
                pivotClockwise()
                forward()
                retract()
                reset()
            }
        }
        )
    }
}
