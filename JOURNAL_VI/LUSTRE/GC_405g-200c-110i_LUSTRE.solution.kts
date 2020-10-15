
solution {
    puzzle = "P090"
    name = "B CC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 7 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to -1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -2 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -3 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 7 to 2
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 11 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 7 to 1
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 10 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 3 to -1, 4 to -1, 4 to 0)
    }
    track {
        position = 9 to 2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 11 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    conduit {
        id = 100
        position = -1 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 9 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(15)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(4)
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                drop()
                wait(3)
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                retract()
                reset()
                wait(1)
                extend()
                wait(1)
                grab()
                retract()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                wait(5)
                extend()
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                extend()
                retract()
                rotateCounterClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(3)
                grab()
                retract()
                retract()
                rotateClockwise()
                wait(1)
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                retract()
                back()
                back()
                reset()
                wait(3)
                grab()
                retract()
                back()
                drop()
                extend()
                wait(3)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                retract()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                wait(2)
                grab()
                retract()
                reset()
            }
        }
        )
    }
}
