
solution {
    puzzle = "P024"
    name = "W3 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 3 to 4
        rotation = -16
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = -12
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to -2
        rotation = -17
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 1 to 0
        rotation = -15
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 2 to 1
        rotation = -15
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -1 to 2
        rotation = -13
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 3 to 2
        rotation = -9
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 0 to 3
        rotation = -14
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = 1 to 4
        rotation = -8
        size = 2
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = -15
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -21
    }
    glyph(DUPLICATION) {
        position = 3 to 3
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = 1 to 2
        rotation = -9
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -11
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 1 to 3
        rotation = 0
    }
    track {
        position = -4 to -3
        positions = listOf(0 to 2, 0 to 1)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
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
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
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
                wait(9)
                grab()
                retract()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                retract()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateCounterClockwise()
                extend()
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
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                retract()
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
                wait(6)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(12)
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                retract()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(12)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
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
            sequence(5) {
                wait(8)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(3)
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
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
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
