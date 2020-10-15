
solution {
    puzzle = "P071"
    name = "W3 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to -6
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to -5
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -4 to -2
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -3 to -1
        rotation = 4
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -2 to -1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 0 to 1
        rotation = 4
        size = 3
    }
    glyph(UNBONDER) {
        position = -3 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to -6
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = -1 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
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
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -4
        rotation = -1
    }
    track {
        position = -4 to -2
        positions = listOf(5 to 4, 4 to 4, 4 to 3, 3 to 3, 3 to 2, 2 to 2, 2 to 1, 1 to 1, 1 to 0, 0 to 0)
    }
    track {
        position = -5 to -4
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(8)
                grab()
                retract()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(3)
                back()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(8)
                repeat()
                wait(9)
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
                wait(13)
                grab()
                retract()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(8)
                extend()
                back()
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(14)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                reset()
                wait(1)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                drop()
                wait(8)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                extend()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                back()
                drop()
                wait(1)
                forward()
                grab()
                extend()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                back()
                retract()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                back()
                retract()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                back()
                retract()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                back()
                retract()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                retract()
                back()
                retract()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(20)
                back()
                grab()
                forward()
                back()
                reset()
                wait(6)
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
                wait(10)
                grab()
                back()
                back()
                reset()
                wait(2)
                grab()
                back()
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
                grab()
                back()
                back()
                back()
                drop()
                forward()
                wait(2)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
