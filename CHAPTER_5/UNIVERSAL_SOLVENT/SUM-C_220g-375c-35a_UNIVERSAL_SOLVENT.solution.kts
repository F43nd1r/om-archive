
solution {
    puzzle = "P043"
    name = "B ACX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to 1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to 2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -3 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -3 to 1
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = -10
    }
    glyph(PURIFICATION) {
        position = -5 to 3
        rotation = -23
    }
    glyph(ANIMISMUS) {
        position = -1 to 0
        rotation = -10
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 4
        rotation = -5
    }
    io(INPUT) {
        index = 2
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = -6 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                retract()
                wait(1)
                grab()
                extend()
                rotateCounterClockwise()
                drop()
                wait(15)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                extend()
                wait(2)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                retract()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                extendTape()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                retract()
                pivotClockwise()
                drop()
                retract()
                wait(1)
                grab()
                extend()
                extend()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(36)
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
