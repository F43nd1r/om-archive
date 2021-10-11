
solution {
    puzzle = "w2450512021"
    name = "W4 3T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to 3
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -1 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -2 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -4 to -5
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -6 to -4
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to 3
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -3 to -3
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
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
        position = 2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    track {
        position = -3 to -5
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 1, -3 to 2, -3 to 3)
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(3) {
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(8)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                extend()
                forward()
                pivotClockwise()
                forward()
                retract()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                forward()
                back()
                back()
                forward()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                pivotClockwise()
                drop()
                wait(7)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(11)
                forward()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                retract()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                extend()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                retract()
                drop()
                forward()
                rotateCounterClockwise()
                wait(8)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateClockwise()
                retract()
                drop()
                forward()
                rotateCounterClockwise()
                wait(8)
                forward()
                wait(1)
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
        )
    }
}
