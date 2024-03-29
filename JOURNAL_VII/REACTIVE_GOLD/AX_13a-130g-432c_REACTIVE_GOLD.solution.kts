
solution {
    puzzle = "P095"
    name = "B ACX 6T"
    arm(PISTON) {
        number = 1
        position = -2 to 3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to 0
        rotation = 2
        size = 2
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                retract()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                reset()
                retract()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                extend()
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                extend()
                wait(11)
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                wait(4)
                extend()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                reset()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(6)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                reset()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(6)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                wait(5)
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                grab()
                extend()
                rotateCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
