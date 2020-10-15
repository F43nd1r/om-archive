
solution {
    puzzle = "P015"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -11 to 0
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -9 to 2
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -7 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -8 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -6 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -8 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -8 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -9 to 1
        rotation = 0
    }
    track {
        position = -7 to 1
        positions = listOf(1 to 0, 0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -9 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                wait(2)
                back()
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
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
                wait(6)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                drop()
                back()
                retract()
                wait(6)
                back()
                wait(1)
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                wait(1)
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                wait(1)
                back()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                drop()
                back()
                retract()
                wait(6)
                back()
                wait(1)
                grab()
                extend()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                retract()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                wait(1)
                back()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                drop()
                back()
                retract()
                wait(6)
                back()
                wait(1)
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                extend()
                wait(1)
                back()
                drop()
                retract()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                extend()
                pivotClockwise()
                drop()
                back()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                back()
                back()
                reset()
                wait(6)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                back()
                back()
                reset()
                wait(7)
                repeat()
                wait(10)
                repeat()
            }
        }
        )
    }
}
