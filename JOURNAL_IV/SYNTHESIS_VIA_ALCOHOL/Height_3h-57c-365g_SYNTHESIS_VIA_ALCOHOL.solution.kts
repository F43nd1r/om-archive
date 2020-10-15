
solution {
    puzzle = "P071"
    name = "H3 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 3 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 8 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 6 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 7 to 0
        rotation = 3
        size = 3
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 5 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 5 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    track {
        position = 9 to -2
        positions = listOf(-2 to 1, -3 to 2, -2 to 2, -1 to 2, -1 to 1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(8)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                back()
                grab()
                forward()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                extend()
                wait(1)
                retract()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                back()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                forward()
                grab()
                back()
                wait(1)
                forward()
                drop()
                wait(3)
                grab()
                back()
                wait(1)
                forward()
                drop()
                wait(3)
                grab()
                back()
                wait(1)
                forward()
                drop()
                wait(3)
                grab()
                back()
                wait(1)
                forward()
                drop()
                wait(3)
                grab()
                back()
                wait(1)
                forward()
                drop()
                wait(3)
                grab()
                back()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                retract()
                retract()
                back()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                back()
                rotateCounterClockwise()
                forward()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
